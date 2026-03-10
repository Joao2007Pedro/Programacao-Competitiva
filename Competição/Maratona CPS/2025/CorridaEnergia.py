while True:
  n = int(input());
  if n == 0:
    break;
  
  arr = list((map(int, input().split())));
  
  energia = 0;
  menor = 0;
  
  for i in arr:
    energia += i;
    if energia < menor:
      menor = energia;
  
  print(energia);
  print(menor);