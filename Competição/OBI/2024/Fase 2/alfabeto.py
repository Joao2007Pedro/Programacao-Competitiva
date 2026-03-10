K, N = map(int, input().split());
alf = str(input());
msg = str(input());

ccN = 0;

for i in range(K):
	ccN += msg.count(alf[i]);

if ccN == N:
	print("S");
else: 
	print("N");
