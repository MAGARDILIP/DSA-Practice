import matplotlib.pyplot as plt
import math

# Input sizes
n = [10, 50, 100, 500, 1000]

# Searching algorithms
linear_search = n                      # O(n)
binary_search = [math.log2(i) for i in n]  # O(log n)

# Sorting algorithms
bubble_sort = [i*i for i in n]         # O(n^2)
selection_sort = [i*i for i in n]      # O(n^2)
insertion_sort = [i*i for i in n]      # O(n^2)
merge_sort = [i * math.log2(i) for i in n]  # O(n log n)
quick_sort = [i * math.log2(i) for i in n]  # O(n log n)
heap_sort = [i * math.log2(i) for i in n]   # O(n log n)

# Searching graph
plt.figure()
plt.plot(n, linear_search, label="Linear Search O(n)")
plt.plot(n, binary_search, label="Binary Search O(log n)")
plt.xlabel("Input Size (n)")
plt.ylabel("Time Complexity")
plt.title("Time Complexity of Searching Algorithms")
plt.legend()
plt.show()

# Sorting graph
plt.figure()
plt.plot(n, bubble_sort, label="Bubble Sort O(n^2)")
plt.plot(n, selection_sort, label="Selection Sort O(n^2)")
plt.plot(n, insertion_sort, label="Insertion Sort O(n^2)")
plt.plot(n, merge_sort, label="Merge Sort O(n log n)")
plt.plot(n, quick_sort, label="Quick Sort O(n log n)")
plt.plot(n, heap_sort, label="Heap Sort O(n log n)")
plt.xlabel("Input Size (n)")
plt.ylabel("Time Complexity")
plt.title("Time Complexity of Sorting Algorithms")
plt.legend()
plt.show()
