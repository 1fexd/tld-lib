import random

from get_tlds import get_tlds

tlds = get_tlds()
amount = 50

random_tlds = []
for i in range(amount):
    random_tlds.append(f"\"{random.choice(tlds)}\"")

items_str = ",".join(random_tlds)
print(f"listOf({items_str})")
