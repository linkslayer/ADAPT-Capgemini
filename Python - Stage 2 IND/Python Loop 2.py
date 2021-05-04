def main():
	a = int(input())
	b = int(input())
	if a<b and a>3 and b<=1000:
		get_prime_numbers(a,b)
	else:
		print("INVALID_INPUT")


def get_prime_numbers(a: int, b: int):
	s = 0
	for i in range(a, b):
		count = 0
		for j in range(1, i+1):
			if i%j == 0:
				count+=1

		if count == 2:
			s+=i
	print(s)


main()
