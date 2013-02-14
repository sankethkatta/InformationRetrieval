# Intersection Algoirithm for 2 Lists
# The two lists must be in sorted order

def intersect(p1, p2)
    answer = []

    i, j = 0, 0
    while (i < p1.length) and (j < p2.length)
        if p1[i] == p2[j]
            answer.push(p1[i])
            i += 1
            j += 1
        elsif p1[i] < p2[j]
            i += 1
        else
            j += 1

        end
    end
    return answer
end

l1 = [1, 3, 4 ,5, 6 ,7].sort()
l2 = [1, 23, 43, 5, 2, 7].sort()

puts intersect(l1, l2)