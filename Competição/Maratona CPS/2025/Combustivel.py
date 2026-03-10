import math;

def reduz(num, casas):
  fator = 10**casas;
  return f"{math.trunc(num*fator)/fator:.{casas}f}"

while True:
  n = int(input());
  if n == 0: break;
  
  maior = 0;
  somaKm = 0;
  somaL = 0;
  
  for _ in range(n):
    a, b = map(int, input().split());
    consumo = b / a;
    
    if consumo > maior:
      maior = consumo;
    
    somaKm += b;
    somaL += a;
  
  media = somaKm / somaL;
  
  print("Media:", media);
  print("Melhor:", maior);