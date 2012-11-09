# test.rb
# Tests validate.rb

require "validate.rb"

# A method to test the CC validator
def test_cc_validator
	if valid_cc?("3728 024906 54059")
		puts "3728 024906 54059 is valid"
	else
		puts "3728 024906 54059 is invalid"
	end

	if valid_cc?("3256 1031 4329 9238")
		puts "3256 1031 4329 9238 is valid"
	else
		puts "3256 1031 4329 9238 is invalid"
	end
	
	puts "*** Run with `ruby -d test.rb` to see debugging info."
end

# run that method
test_cc_validator
