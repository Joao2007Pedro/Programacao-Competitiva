while True:
  n = int(input());
  if n == 0:
    break;
  
  arr = list((map(int, input().split())));
  soma = 0;
  
  for i in arr:
    soma += (90 * i) // 100;
  
  print(soma);