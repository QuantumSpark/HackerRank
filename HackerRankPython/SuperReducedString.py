inputString = list(raw_input().strip())

# Get the string with no repetition

index = 0
while (index < len(inputString)-1):
   if (inputString[index] == inputString[index+1]):
      inputString.pop(index)
      inputString.pop(index)
      index = 0
   else:
      index+=1



if len(inputString) == 0:
    print "Empty String"

print ''.join(inputString)