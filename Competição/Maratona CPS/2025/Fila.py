while True:
  n = int(input());
  if n == 0:
    break;
  
  arr = list((map(int, input().split())));
  media = sum(arr) // n;
  
  print(min(arr), max(arr), media);