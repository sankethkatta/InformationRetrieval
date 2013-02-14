# Intersection Algoirithm for 2 Lists
# The two lists must be in sorted order

intersect = (p1, p2) ->
    answer = []

    i = 0
    j = 0

    while (i < p1.length) and (j < p2.length)
        if p1[i] == p2[j]
            answer.push(p1[i])
            i++
            j++
        else if p1[i] < p2[j]
            i++
        else
            j++

    return answer

sortFunction = (a, b) -> return a - b

l1 = [1, 3, 4 ,5, 6 ,7].sort(sortFunction)
l2 = [1, 23, 43, 5, 2, 7].sort(sortFunction)

console.log intersect(l1, l2)