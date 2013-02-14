# Intersection Algoirithm for 2 Lists
# The two lists must be in sorted order

intersect = function(p1, p2) {
    answer = array()

    i = 1
    j = 1

    while ( (i <= length(p1)) & (j <= length(p2)) ) {
        if (p1[i] == p2[j]) {
            answer = c(answer, p1[i])
            i = i + 1
            j = j + 1
        } else if (p1[i] < p2[j]) {
            i = i + 1
        } else {
            j = j + 1
        }

    }
    return(answer)
}

l1 = sort(c(1, 3, 4 ,5, 6 ,7))
l2 = sort(c(1, 23, 43, 5, 2, 7))


print(intersect(l1, l2))