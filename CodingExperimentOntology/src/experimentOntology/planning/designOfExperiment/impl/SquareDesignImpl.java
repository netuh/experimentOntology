/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import experimentOntology.planning.Factor;

import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;
import experimentOntology.planning.designOfExperiment.SquareDesign;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.SquareDesignImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.SquareDesignImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareDesignImpl extends TwoFactorDesignImpl implements SquareDesign {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Factor column;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected Factor line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignOfExperimentPackage.Literals.SQUARE_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (Factor)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignOfExperimentPackage.SQUARE_DESIGN__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Factor newColumn) {
		Factor oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.SQUARE_DESIGN__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor getLine() {
		if (line != null && line.eIsProxy()) {
			InternalEObject oldLine = (InternalEObject)line;
			line = (Factor)eResolveProxy(oldLine);
			if (line != oldLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignOfExperimentPackage.SQUARE_DESIGN__LINE, oldLine, line));
			}
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factor basicGetLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(Factor newLine) {
		Factor oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.SQUARE_DESIGN__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignOfExperimentPackage.SQUARE_DESIGN__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case DesignOfExperimentPackage.SQUARE_DESIGN__LINE:
				if (resolve) return getLine();
				return basicGetLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DesignOfExperimentPackage.SQUARE_DESIGN__COLUMN:
				setColumn((Factor)newValue);
				return;
			case DesignOfExperimentPackage.SQUARE_DESIGN__LINE:
				setLine((Factor)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DesignOfExperimentPackage.SQUARE_DESIGN__COLUMN:
				setColumn((Factor)null);
				return;
			case DesignOfExperimentPackage.SQUARE_DESIGN__LINE:
				setLine((Factor)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DesignOfExperimentPackage.SQUARE_DESIGN__COLUMN:
				return column != null;
			case DesignOfExperimentPackage.SQUARE_DESIGN__LINE:
				return line != null;
		}
		return super.eIsSet(featureID);
	}

} //SquareDesignImpl
