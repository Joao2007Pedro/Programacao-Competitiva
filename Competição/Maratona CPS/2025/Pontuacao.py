while True:
  p, r = map(int, input().split());
  if p == 0 and r == 0:
    break;
  
  pontuacao = [0] * p;
  maiorPont = [0] * p;
  
  for _ in range(r):
    linha = list(map(int, input().split()));
    
    for i in range(p):
      pontuacao[i] += linha[i];
      if linha[i] > maiorPont[i]:
        maiorPont[i] = linha[i];
  
  valorMaxPont = max(pontuacao);
  
  if pontuacao.count(valorMaxPont) > 1:
    valorMaxMaiorPont = max(maiorPont);
    indiceMaxMaiorPont = maiorPont.index(valorMaxMaiorPont);
    
    print("Time", indiceMaxMaiorPont+1);
  else:
    indiceMaxPont = pontuacao.index(valorMaxPont);
    print("Time", indiceMaxPont+1);