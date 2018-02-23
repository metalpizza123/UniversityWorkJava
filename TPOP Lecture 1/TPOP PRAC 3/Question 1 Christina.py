def question1():

    a = str(input("What word do you want to check? "))
    a = a.lower()
    a = a.replace(" ", "")
    b = a[::-1]
    if a==b:
        print ("YES Its a palindromeeee")
    else:
        print ("NO Its not a palindromeeee")

question1()