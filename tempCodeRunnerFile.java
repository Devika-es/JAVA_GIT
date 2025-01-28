 Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext())
        {
            int num=iterator.next();
            if(num==12)
            {
                iterator.remove();
            }
        }