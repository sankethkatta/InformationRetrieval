# Intersection Algoirithm for 2 Lists
# The two lists must be in sorted order

def intersect(p1, p2):
    answer = []

    i, j = 0, 0
    while (i < len(p1)) and (j < len(p2)):
        if p1[i] == p2[j]:
            answer.append(p1[i])
            i += 1
            j += 1
        elif p1[i] < p2[j]:
            i += 1
        else:
            j += 1

    return answer

l1 = [1, 3, 4 ,5, 6 ,7]
l2 = [1, 23, 43, 5, 2, 7]
l1.sort()
l2.sort()

print(intersect(l1, l2))