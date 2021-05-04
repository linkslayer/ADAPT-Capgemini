def decimalToBinary(num):
	if num>1:
		decimalToBinary(num//2)
	print(num%2, end='')


n = int(input())
if 1<n<999:
	decimalToBinary(n)
else:
	print("INVALID_INPUT")
