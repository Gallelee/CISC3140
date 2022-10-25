#!/bin/sh

currentDate=$(date +%s)
lab1Date=$(date --date="Sep 27" +%s) #using the %s to do arithmetic on the seconds
lab2Date=$(date --date="Oct 26" +%s)
lab3Date=$(date --date="Nov 23" +%s)
lab4Date=$(date --date="Dec 7" +%s)

echo "Would you like to see days until all due dates[insert Y], or select your own date?[insert N]"

read optionResponse
echo "chose" $optionResponse

if [ "$optionResponse" = "Y" ]
then
	echo days until lab 1 is due: $(((lab1Date - currentDate)/86400))
	echo days until lab 2 is due: $(((lab2Date - currentDate)/86400))
	echo days until lab 3 is due: $(((lab3Date - currentDate)/86400))
	echo days until lab 4 is due: $(((lab4Date - currentDate)/86400))
elif [ $optionResponse = "N" ]
then
	echo "Enter your date in MM/DD/YYYY or MM-DD formats. If using MM-DD, the year will default to the next year"
	read inputDate
	customDate=$(date --date="$inputDate" +%s)
	echo days until your custom date: $(((customDate - currentDate)/86400))
fi

