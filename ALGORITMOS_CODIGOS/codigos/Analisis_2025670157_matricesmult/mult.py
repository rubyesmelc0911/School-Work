# Function to multiply two matrices
def multiply_matrices(A, B):
    # Get the dimensions
    rows_A = len(A)
    cols_A = len(A[0])
    rows_B = len(B)
    cols_B = len(B[0])

    # Check if multiplication is possible
    if cols_A != rows_B:
        raise ValueError("Number of columns in A must equal number of rows in B")

    # Initialize result matrix with zeros
    result = [[0 for _ in range(cols_B)] for _ in range(rows_A)]

    # Perform multiplication
    for i in range(rows_A):
        for j in range(cols_B):
            for k in range(cols_A):  # or rows_B, same thing
                result[i][j] += A[i][k] * B[k][j]

    return result

# Example usage:
A = [
    [1, 2, 3],
    [4, 5, 6]
]

B = [
    [7, 8],
    [9, 10],
    [11, 12]
]

result = multiply_matrices(A, B)

# Display the result
print("Result of A x B:")
for row in result:
    print(row)
