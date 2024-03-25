current_date= "17/08/2023"
date_of_birth= "12/11/2003"

day_of_born = int(date_of_birth[0:2])
month_born = int(date_of_birth[3:5])
year_of_birth = int(date_of_birth[6:10])

current_day = int(current_date[0:2])
current_month = int(current_date[3:5])
curent_year = int(current_date[6:10])

def is_leap_year():
    leap_year=False
    if curent_year%4 ==0:
        leap_year= True
    return leap_year




count_of_leap_years = 0
for year in range(year_of_birth,curent_year):
    if year % 4 ==0:
        count_of_leap_years+=1



year_difference = curent_year - year_of_birth
no_of_day_difference_wrt_year = (year_difference*365) + count_of_leap_years

def calculating_no_of_days_in_month(current_month):
    if current_month ==1 or current_month==3 or current_month==5 or current_month==7 or current_month==8 or current_month==10 or current_month==12:
        no_of_day_in_month = 31

    elif current_month ==4 or current_month==6 or current_month==9 or current_month==11:
        no_of_day_in_month = 30
    elif is_leap_year()==False and current_month ==2:
        no_of_day_in_month = 28
    elif is_leap_year()==True and current_month ==2:
        no_of_day_in_month = 29

    return no_of_day_in_month

no_of_days_in_current_year = 0
for the_month in range(current_month):
    no_of_days_in_current_year += calculating_no_of_days_in_month(the_month)
print(type(no_of_days_in_current_year))





