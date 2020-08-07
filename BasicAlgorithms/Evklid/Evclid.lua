a = 1234567890
b =12
while(a~=0 and b~=0)
do
  if(a > b)
  then
      a = a % b
  else
      b = b % a
  end
end
print ('NOD',a)
