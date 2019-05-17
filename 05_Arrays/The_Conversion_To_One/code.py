#code
x=input();
x=int(x)
c=0
while(x>0):
    br=input()
    br=int(br)
    c=0
    while br>1:
        if br%2==0:
            br=br/2;
        else:
            br=br-1
        c=c+1     
    print(c)
    x=x-1