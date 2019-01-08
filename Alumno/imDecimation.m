%FunciÃ³n diezmado de una imagen

function out = imDecimation( image, D);

[m n] = size(image);
k=1;

%[c] Recorrer imagen creando la salida
% se recorre imagen con indices ind=1:D:tamaño_matriz (fila o columnas)
%out(k,l)=image(i,j);

for i=1:D:m 
  k++; 
  l=1; 
  for j=1:D:n 
    out(k,l) = image(i,j); 
    l++; 
  end 
end 

endfunction
