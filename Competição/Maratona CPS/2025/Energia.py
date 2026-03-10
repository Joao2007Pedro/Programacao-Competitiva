while True:
  n = int(input());
  if n == 0: break;
  
  dep = {
    "A": [0, 0],
    "D": [0, 0],
    "P": [0, 0],
    "V": [0, 0],
    "M": [0, 0],
  };
  
  # consumo / qtd
  
  dic = {};
  
  for _ in range(n):
    linha = input().split();
    
    cod = linha[0];
    tipo = linha[1];
    cons = float(linha[2]);
    
    dic[cod] = [tipo, cons];
  
  print(dic);