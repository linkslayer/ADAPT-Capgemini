def main():
	p = int(input())
	m = int(input())
	c = int(input())
	if p<=100 and p>0 and c<=100 and c>0 and m<=100 and m>0:
		avg = (p+c+m)//3
		if avg>=70:
			print("DISTINCTION")
		elif avg>=60:
			print("FIRST")
		elif avg>=50:
			print("SECOND")
		elif avg>=40:
			print("THIRD")	
		else:
			print("FAIL")
	else:
		print("INVALIDMARKS")


main()
