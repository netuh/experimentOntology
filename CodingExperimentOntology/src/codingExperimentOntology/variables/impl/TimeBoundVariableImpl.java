/**
 */
package codingExperimentOntology.variables.impl;

import codingExperimentOntology.apparatus.TimeMonitorInstrument;

import codingExperimentOntology.variables.NewPackage1Package;
import codingExperimentOntology.variables.TimeBoundVariable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Bound Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.impl.TimeBoundVariableImpl#getTimeMonitor <em>Time Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeBoundVariableImpl extends CodingDependentVariableImpl implements TimeBoundVariable {
	/**
	 * The cached value of the '{@link #getTimeMonitor() <em>Time Monitor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeMonitor()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeMonitorInstrument> timeMonitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBoundVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.TIME_BOUND_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeMonitorInstrument> getTimeMonitor() {
		if (timeMonitor == null) {
			timeMonitor = new EObjectResolvingEList<TimeMonitorInstrument>(TimeMonitorInstrument.class, this, NewPackage1Package.TIME_BOUND_VARIABLE__TIME_MONITOR);
		}
		return timeMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage1Package.TIME_BOUND_VARIABLE__TIME_MONITOR:
				return getTimeMonitor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage1Package.TIME_BOUND_VARIABLE__TIME_MONITOR:
				getTimeMonitor().clear();
				getTimeMonitor().addAll((Collection<? extends TimeMonitorInstrument>)newValue);
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
			case NewPackage1Package.TIME_BOUND_VARIABLE__TIME_MONITOR:
				getTimeMonitor().clear();
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
			case NewPackage1Package.TIME_BOUND_VARIABLE__TIME_MONITOR:
				return timeMonitor != null && !timeMonitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeBoundVariableImpl
