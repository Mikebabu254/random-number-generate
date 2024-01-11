import random

def generate_random_eight_digit_number():
    return random.randint(10000000, 99999999)

# Example usage
random_number = generate_random_eight_digit_number()
print("Random eight-digit number:", random_number)
