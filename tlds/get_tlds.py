import requests


def get_tlds():
    page = requests.get("https://publicsuffix.org/list/public_suffix_list.dat")
    icann_domains = []
    for line in page.text.splitlines():
        if "END ICANN DOMAINS" in line:
            break
        elif line.startswith("//"):
            continue
        else:
            _domain = line.strip()
            if _domain and _domain != "*":
                clean_domain = _domain.replace("*.", "").replace("!", "")
                icann_domains.append(clean_domain)

    return icann_domains


with open("domains", "w") as file:
    for domain in get_tlds():
        file.write(domain)
        file.write("\n")
