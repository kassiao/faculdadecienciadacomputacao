def data_valida(data):
    dia, mes, ano = map(int, data.split('/'))
    meses_com_31_dias = {1, 3, 5, 7, 8, 10, 12}
    meses_com_30_dias = {4, 6, 9, 11}
    
    if (ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0:
        fevereiro = 29
    else:
        fevereiro = 28
    
    if mes < 1 or mes > 12:
        return False
    
    if mes == 2:
        if dia < 1 or dia > fevereiro:
            return False
    elif mes in meses_com_31_dias:
        if dia < 1 or dia > 31:
            return False
    elif mes in meses_com_30_dias:
        if dia < 1 or dia > 30:
            return False
        return True
