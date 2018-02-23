firstnumber=int(input('Please enter the first number '))
secondnumber=int(input('Please enter the second number '))
thirdnumber=int(input('Please enter the third number '))
statement="the largest number is"
#print (type(firstnumber))
#if (type(firstnumber)!=int or type(secondnumber)!=int or type(thirdnumber)!=int):
#    print ('integer numbers only PLEEEEEEASE')
else:
    if firstnumber==secondnumber:
        if firstnumber==thirdnumber:
            print('there is no largest number')
        elif firstnumber<thirdnumber:
            print (statement,thirdnumber)
        else:
            print (statement,firstnumber)
    elif firstnumber>secondnumber:
        if firstnumber==thirdnumber:
            print (statement,firstnumber)
        elif firstnumber>thirdnumber:
            print (statement,firstnumber)
        else:
            print(statement,thirdnumber)
    else:
        if secondnumber==thirdnumber:
            print (statement,secondnumber)
        elif secondnumber>thirdnumber:
            print (statement,secondnumber)
        else:
            print (statement,thirdnumber)

        
                 
