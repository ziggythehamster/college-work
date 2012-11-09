# validate.rb
# Ruby program to validate a credit card number
# (C) 2008 Keith Gable <ziggy@ignition-project.com>
#
# Released under the terms of the Creative Commons Attribution Share-Alike 2.0 License (CC-by-SA-2.0)

# Returns true if the CC is valid.
def valid_cc?(cc_number)
	cc_number.gsub!(/\D/, "") # delete all non-numerical characters
	cc_length = cc_number.length # saves me typing
	parity = cc_length % 2 # length mod 2 => parity is 1 if odd, 0 if even
	checksum = 0

	if $DEBUG
		puts "dbg: cc##{cc_number} len=#{cc_length} par=#{parity}"
	end

	# Go through each digit
	cc_length.times do |position|
		cur_digit = cc_number[position] - 48 # get the current digit - returns the ASCII code, so subtract 48, because 0 is ASCII 48 - this makes cur_digit be 0 if ASCII 48, 1 if ASCII 49, etc.
		
		if $DEBUG
			puts "dbg: cur_digit=#{cur_digit} pos=#{position} chk=#{checksum}"
		end
		
		# if position % 2 is parity (e.g. odd for an odd-numbered CC, even for an even-numbered
		# CC), then this is our even weighted digit; multiply by two
		if (position % 2) == parity then
			cur_digit = cur_digit * 2
		end

		# If the digit is > 9, subtract 9 (applies to weight=1 and weight=2)
		if cur_digit > 9 then
			cur_digit = cur_digit - 9
		end

		checksum += cur_digit
	end

	return ((checksum % 10) == 0) # evaluate the expression to true or false and return that value
end
