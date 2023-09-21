s=input()
def fun(s):
    char_x=0
    char_y=0
    for i in s:
        if i =='x':
            char_x+=1
        elif i=='y':
            char_y+=1
        else: return 0
    return char_x==char_y
print(fun(s))
