def main():
	s1 = int(input())
	s2 = int(input())
	s3 = int(input())
	if s1 > s2 > s3:
		sos = s2*s2 + s3*s3
		check = s1*s1
		if check == sos:
			print("RIGHT ANGLE TRIANGLE")
		else:
			print("NOT RIGHT ANGLE TRIANGLE")
	else:
		print("INVALID_INPUT")


main()
