#include <stdio.h>
#include <unistd.h>
#define MSGSIZE 20
char* msg1 = "hello world ";
char* msg2 = "Welcome";
char* msg3 = "Thank you";
int main()
{
char inbuf[MSGSIZE];
int p[2], pid, nbytes;
if (pipe(p) < 0)
exit(1);
if ((pid = fork()) > 0) {
write(p[1], msg1, MSGSIZE);
write(p[1], msg2, MSGSIZE);
write(p[1], msg3, MSGSIZE);
close(p[1]);
wait(NULL);
}
else {
close(p[1]);
while ((nbytes = read(p[0], inbuf, MSGSIZE)) > 0)
printf("% s\n", inbuf);
if (nbytes != 0)
exit(2);
printf("Finished reading\n");
}
return 0;
}
