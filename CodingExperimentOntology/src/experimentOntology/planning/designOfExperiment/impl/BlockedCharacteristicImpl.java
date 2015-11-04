/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import experimentOntology.planning.designOfExperiment.BlockedCharacteristic;
import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;

import experimentOntology.planning.threats.Threat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blocked Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.planning.designOfExperiment.impl.BlockedCharacteristicImpl#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockedCharacteristicImpl extends MinimalEObjectImpl.Container implements BlockedCharacteristic {
	/**
	 * The cached value of the '{@link #getThreat() <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreat()
	 * @generated
	 * @ordered
	 */
	protected Threat threat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockedCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignOfExperimentPackage.Literals.BLOCKED_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat getThreat() {
		if (threat != null && threat.eIsProxy()) {
			InternalEObject oldThreat = (InternalEObject)threat;
			threat = (Threat)eResolveProxy(oldThreat);
			if (threat != oldThreat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC__THREAT, oldThreat, threat));
			}
		}
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat basicGetThreat() {
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreat(Threat newThreat) {
		Threat oldThreat = threat;
		threat = newThreat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC__THREAT, oldThreat, threat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC__THREAT:
				if (resolve) return getThreat();
				return basicGetThreat();
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
			case DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC__THREAT:
				setThreat((Threat)newValue);
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
			case DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC__THREAT:
				setThreat((Threat)null);
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
			case DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC__THREAT:
				return threat != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockedCharacteristicImpl
