def max_toys(prices, rupees):
  answer = 0
  while True:
      m = min(prices)
      rupees = rupees - m
      if rupees <= 0:
          break
      prices.remove(m)
      answer+= 1

  return answer

if __name__ == '__main__':
  n, k = map(int, raw_input().split())
  prices = map(int, raw_input().split())
  print max_toys(prices, k)