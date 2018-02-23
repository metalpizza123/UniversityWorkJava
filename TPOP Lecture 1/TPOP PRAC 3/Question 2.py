def scalarproduct ():
    scalar=float(input("Please enter the scalar "))
    vector=[0,1,2]
    vector[0]=float(input("PLease enter the first value of the vector "))
    vector[1]=float(input("PLease enter the second value of the vector "))
    vector[2]=float(input("PLease enter the third value of the vector "))
    v1=[(scalar*vector[0]),(scalar*vector[1]),(scalar*vector[2])]
    print ("(",v1[0],")")
    print("(", v1[1], ")")
    print("(", v1[2], ")")
def vectorproduct ():
    vector1 = [0, 1, 2]
    vector1[0] = float(input("PLease enter the first value of the first vector "))
    vector1[1] = float(input("PLease enter the second value of the first vector "))
    vector1[2] = float(input("PLease enter the third value of the first vector "))
    vector2 = [0, 1, 2]
    vector2[0] = float(input("PLease enter the first value of the second vector "))
    vector2[1] = float(input("PLease enter the second value of the second vector "))
    vector2[2] = float(input("PLease enter the third value of the second vector "))
    v2=[(vector1[0]*vector2[0]),(vector1[1]*vector2[1]),(vector1[2]*vector2[2])]
    print("(", v2[0], ")")
    print("(", v2[1], ")")
    print("(", v2[2], ")")
print("What kind of operation would you like to do? Please enter a or b")
print("a)scalar product")
print("b)vector product")
choice=str(input(" "))
if choice=="a":
    scalarproduct()
if choice=="b":
    vectorproduct()
