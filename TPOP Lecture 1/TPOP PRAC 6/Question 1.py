class Vector(object):
    def __init__(self, data=None):
        self._vector=[]
        if (data is not None):
            for value in data:
                self._vector.append(float(value))
    def __str__(self):
        if len(self._vector)==0:
            return '<>'
        else:
            output='<'
            for value in self._vector[:-1]:
                output+=str(value)+', '
            output+= str(self._vector[-1])+'>'
            return output
    def dim(self):
        vectorlength=len(self._vector)
        return vectorlength
    def get(self,index):
        output=self._vector[index-1]
        return output
    def set (self,index,value):
        self._vector[index-1]=float(value)
    def scalarproduct(self,value):
        product=[]
        for vectorvalues in self._vector:
            product.append(value*vectorvalues)
            newvector=Vector(product)
            return newvector
    def addthevector(self,nextvect):
        sum=[]
        for countup in range(len(self._vector)):
            sum.append((self._vector[countup])+(nextvect._vector[countup]))
        totalsum=Vector(sum)
        return totalsum
    def multiplyvector(self,nextvect):
        product=[]
        for countup in range(len(self._vector)):
            product.append((self._vector[countup])*(nextvect._vector[countup]))
        totalproduct=Vector(product)
        return totalproduct
myvect1=Vector([1,4,6])
myvect2=Vector([5,5,8])
print (myvect1.multiplyvector(myvect2))
print (myvect1.dim())
added=myvect1.addthevector(myvect2)
print (added)