while True:
  n = int(input());
  if n == 0:
    break;
  
  arr = [];
  for _ in range(n):
    linha = list(map(int, input().split()));
    somaLinha = sum(linha);
    arr.append(somaLinha);
  
  indice = arr.index(max(arr))
  print("Drone", indice+1);