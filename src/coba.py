# def is_leap(year):
#     if year % 4 == 0:
#         leap = True
#     if not year // 100 % 4 == 0 and year % 100 == 0: 
#         leap = False
    
#     return leap

# print(is_leap(1960))

# x = 1
# y = 1
# z = 2
# n = 0

# list = [[i, j, z] for i in range(0, x + 1) for j in range(0, y + 1) for k in range(0, z + 1) if i + j + z != n]

# print(list)

arr = map(lambda x: x + x, [1, 2, 3, 4])
print(list(arr))
print(max(2, 3))