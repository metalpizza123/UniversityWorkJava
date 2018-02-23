pal=0
for a in range(10,100):
    for b in range(10, 100):
        for c in range(10, 100):
            for d in range(10, 100):
                number=a*b*c*d
                string=str(number)
                flipped=string[::-1]
                if string==flipped:
                    if pal<number:
                        pal=number
                        factor1=a
                        factor2=b
                        factor3=c
                        factor4=d
print(pal)
print(factor1)
print(factor2)
print(factor3)
print(factor4)