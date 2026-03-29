compile:
	javac -d bin src/bank/model/*.java src/bank/driver/*.java

test_main:
	java -cp bin bank.driver.Main
