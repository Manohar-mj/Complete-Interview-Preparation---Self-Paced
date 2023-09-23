def divisibleBy5(n):
    res=int(n)
    for i in range(res):
        if i%res ==0:
            return 0
        else: 1
n="1000001"
print(divisibleBy5(n))