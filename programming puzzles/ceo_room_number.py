# The entire Class of 2023 along with the faculty members and Sridhar sensei plan to go on a holiday and stay at a hotel. The total number of rooms in that hotel is a three-digit number. Sridhar sensei prefers to stay in a room such that the sum of all the room numbers before his room number is equal to the sum of all the room numbers greater than his room number.
# Your job is to identify Sridhar sensei's room number as well as the total number of rooms in that hotel


def sum_of_rooms(n):
    return (n*(n+1))//2

for total_rooms in range(100, 1000):
    for ceo_room in range(1, total_rooms):
        sum_before = sum_of_rooms(ceo_room - 1)
        sum_after = sum_of_rooms(total_rooms) - sum_before - ceo_room
        if sum_before == sum_after:
            print("ceo room is ",ceo_room)
            print("total rooms are ",total_rooms)
            # break

    