#change all letters from a to z
#all to upper case
#remove all spaces

def translate(userinput):
    userinput=userinput.upper()
    userinput=userinput.replace(" ","")
    userinput=userinput.replace("A","Z")
    print (userinput)


usertext= str(input("Please put whatever word you want to convert"))
translate(usertext)
