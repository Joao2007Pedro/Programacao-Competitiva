while True:
  n = int(input());
  if n == 0:
    break;
  arrN = list(map(int, input().split()));
  
  p = int(input());
  arrP = list(map(int, input().split()));
  
  for i in arrP:
    if arrN[i-1] > 0:
      arrN[i-1] -= 1;
  
  esgotado = 0;
  for j in range(n):
    if arrN[j] == 0:
      esgotado += 1;
  
  print(n-esgotado);
  print(esgotado);