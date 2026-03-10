while True:
  n = int(input());
  if n == 0: break;
  
  maior = 0;
  for i in range(n):
    entrou, saiu = map(int, input().split());
    
    if i == 0:
      atual = entrou;
    else:
      atual -= saiu;
      atual += entrou;
    
    if atual > maior:
      maior = atual;
    
  print(maior);
