def divisibleBy5(n):
    res=int(n)
    if res%5 ==0:
        return '1'
    else: return '0'
n="556"
print(divisibleBy5(n))