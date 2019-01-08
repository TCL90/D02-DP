function R = imConvolve(image, mask)
% Image(n, m) – imagen monocromática
% Mask(n, m) – matriz con los valores de la máscara
% R(n,m)	-  Imagen resultante

%[c]  Convierte a tipos FLOAT imagen y mask

image = double(image); 
mask = double(mask); 

[filas, cols] = size(image);
[fmask, colmask] = size(mask);


R = zeros(filas, cols, "single");


incrf = fix(fmask/2);
incrc = fix(colmask/2);

imax = filas - fmask+1;
jmax = cols - colmask+1;

for i=1:imax
  for j=1:jmax
      R(i+incrf, j+incrc) = aplicaMascara(image, i,j, mask);
  end
end
endfunction




function val = aplicaMascara(image, n, m, mask)
val = single(0);

[filas, cols] = size(mask);

  %[c] Recorrer toda la mascara calculando el resultado de aplicar la mascara como se establece en el enunciado de la practica
endfunction

for i=1:filas 
    for j=1:cols 
      val += image(n+i-1, m+j-1)*mask(i,j); 
    end 
  end 
endfunction 
