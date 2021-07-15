# URI Online Judge | 2663 | Phase

competitors = int(input())
k = int(input())
next_competitors = 0

scores = []

for i in range(competitors):
    score = int(input())
    scores.append(score)

unique_scores = list(set(scores))
unique_scores.reverse()

for score in unique_scores:
    next_competitors += scores.count(score)

    if next_competitors >= k:
        break

print(next_competitors)
