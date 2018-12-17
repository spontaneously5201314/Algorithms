def search(exp, nums):
    if '_' not in exp or nums is None:
        exps = exp.split('=')
        if eval(exps[0]) == float(exps[1]):
            print exps[0]+'='+exps[1]
        return
    else:
        for num in nums:
            e = exp.replace('_', num, 1)
            ns = nums[:]
            ns.remove(num)
            search(e, ns)


if __name__ == '__main__':
    exp = raw_input()
    nums = raw_input().split(' ')
    search(exp, nums)