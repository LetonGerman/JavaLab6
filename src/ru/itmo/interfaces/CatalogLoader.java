package ru.itmo.interfaces;

import ru.itmo.exceptions.CatalogLoadException;

public interface CatalogLoader {

  boolean load() throws CatalogLoadException;
}
